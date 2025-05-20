package sumservice;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import sumservice.SumProto.*;

import java.io.IOException;

public class SumServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(8080)
                .addService(new SumServiceImpl())
                .build();

        server.start();
        System.out.println("Server started on port 8080");
        server.awaitTermination();
    }

    static class SumServiceImpl extends SumServiceGrpc.SumServiceImplBase {
        @Override
        public void calculateSum(NumberArray request,
                                 StreamObserver<SumResponse> responseObserver) {
            int sum = request.getNumbersList().stream()
                    .mapToInt(i -> i).sum();
            SumResponse response = SumResponse.newBuilder()
                    .setSum(sum)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onCompleted();
            System.out.println("Calculated sum: " + sum);
        }
    }
}