package sumservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: sum.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SumServiceGrpc {

  private SumServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "SumService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<sumservice.NumberArray,
      sumservice.SumResponse> getCalculateSumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CalculateSum",
      requestType = sumservice.NumberArray.class,
      responseType = sumservice.SumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<sumservice.NumberArray,
      sumservice.SumResponse> getCalculateSumMethod() {
    io.grpc.MethodDescriptor<sumservice.NumberArray, sumservice.SumResponse> getCalculateSumMethod;
    if ((getCalculateSumMethod = SumServiceGrpc.getCalculateSumMethod) == null) {
      synchronized (SumServiceGrpc.class) {
        if ((getCalculateSumMethod = SumServiceGrpc.getCalculateSumMethod) == null) {
          SumServiceGrpc.getCalculateSumMethod = getCalculateSumMethod =
              io.grpc.MethodDescriptor.<sumservice.NumberArray, sumservice.SumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CalculateSum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sumservice.NumberArray.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  sumservice.SumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new SumServiceMethodDescriptorSupplier("CalculateSum"))
              .build();
        }
      }
    }
    return getCalculateSumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SumServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceStub>() {
        @java.lang.Override
        public SumServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceStub(channel, callOptions);
        }
      };
    return SumServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SumServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceBlockingStub>() {
        @java.lang.Override
        public SumServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceBlockingStub(channel, callOptions);
        }
      };
    return SumServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SumServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SumServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SumServiceFutureStub>() {
        @java.lang.Override
        public SumServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SumServiceFutureStub(channel, callOptions);
        }
      };
    return SumServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void calculateSum(sumservice.NumberArray request,
        io.grpc.stub.StreamObserver<sumservice.SumResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCalculateSumMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service SumService.
   */
  public static abstract class SumServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return SumServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service SumService.
   */
  public static final class SumServiceStub
      extends io.grpc.stub.AbstractAsyncStub<SumServiceStub> {
    private SumServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceStub(channel, callOptions);
    }

    /**
     */
    public void calculateSum(sumservice.NumberArray request,
        io.grpc.stub.StreamObserver<sumservice.SumResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCalculateSumMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service SumService.
   */
  public static final class SumServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<SumServiceBlockingStub> {
    private SumServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public sumservice.SumResponse calculateSum(sumservice.NumberArray request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCalculateSumMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service SumService.
   */
  public static final class SumServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<SumServiceFutureStub> {
    private SumServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SumServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SumServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<sumservice.SumResponse> calculateSum(
        sumservice.NumberArray request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCalculateSumMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CALCULATE_SUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CALCULATE_SUM:
          serviceImpl.calculateSum((sumservice.NumberArray) request,
              (io.grpc.stub.StreamObserver<sumservice.SumResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getCalculateSumMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              sumservice.NumberArray,
              sumservice.SumResponse>(
                service, METHODID_CALCULATE_SUM)))
        .build();
  }

  private static abstract class SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SumServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return sumservice.SumProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SumService");
    }
  }

  private static final class SumServiceFileDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier {
    SumServiceFileDescriptorSupplier() {}
  }

  private static final class SumServiceMethodDescriptorSupplier
      extends SumServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    SumServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (SumServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SumServiceFileDescriptorSupplier())
              .addMethod(getCalculateSumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
