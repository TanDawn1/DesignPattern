  @Override
                public void handleDelivery(String consumerTag, Envelope envelope,
                                           AMQP.BasicProperties properties, byte[] body) throws IOException {
                    //super.handleDelivery(consumerTag, envelope, properties, body);
                    String message = new String(body,"utf-8");
                    System.out.println(message);
                    //开一个线程去处理
//                    new Thread(()->{
                        //获取负责处理的对象
                        ISaveService iSaveService = SaveServiceImpl.saveService();
                        if(iSaveService.saveData(message)){
                            System.out.println("处理完成: "+message);
                        }else{
                            logger.info("数据存储失败 "+message);
                            throw new RuntimeException();
                        }
//                    }).start();

                }
