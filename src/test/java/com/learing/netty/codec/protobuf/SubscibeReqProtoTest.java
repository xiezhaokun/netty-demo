package com.learing.netty.codec.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author xiezhaokun
 */
public class SubscibeReqProtoTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
        SubscribeReqProto.SubscribeReq.Builder builder = SubscribeReqProto.SubscribeReq.newBuilder();
        builder.setAddress("地址");
        builder.setProductName("产品名称");
        builder.setSubReqID(1);
        SubscribeReqProto.SubscribeReq subscribeReq = builder.build();
        System.out.println(subscribeReq.toString());

        SubscribeReqProto.SubscribeReq subscribeReq1 = SubscribeReqProto.SubscribeReq.parseFrom(subscribeReq.toByteArray());

        System.out.println(subscribeReq1.toString());

        System.out.println(subscribeReq.equals(subscribeReq1));
    }
}
