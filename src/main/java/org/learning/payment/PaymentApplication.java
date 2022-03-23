package org.learning.payment;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class PaymentApplication extends Application<PaymentConfiguration> {
    @Override
    public void run(PaymentConfiguration paymentConfiguration, Environment environment) throws Exception {
        environment.jersey().register(new);
    }

    @Override
    public void initialize(Bootstrap<PaymentConfiguration> b){

    }

    public static void main(String[] args) throws Exception {
        new PaymentApplication().run();
    }

}
