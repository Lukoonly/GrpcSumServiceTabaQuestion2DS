package sumservice;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Arrays;

public class SumClient {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder
                .forAddress("localhost", 8080)
                .usePlaintext()
                .build();

        SumServiceGrpc.SumServiceBlockingStub stub =
                SumServiceGrpc.newBlockingStub(channel);

        NumberArray request = NumberArray.newBuilder()
                .addAllNumbers(Arrays.asList(1, 2, 3, 4, 5))
                .build();

        SumResponse response = stub.calculateSum(request);
        System.out.println("Received sum: " + response.getSum());

        channel.shutdown();
    }
}