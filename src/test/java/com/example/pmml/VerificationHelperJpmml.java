package com.example.pmml;

import lombok.SneakyThrows;
import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;

import java.io.InputStream;
import java.util.Objects;

public class VerificationHelperJpmml implements VerificationHelper {
        @SneakyThrows
        public void verify(String resourceName) {
                InputStream inputStream = Objects.requireNonNull(VerificationHelperJpmml.class.getClassLoader().getResourceAsStream(resourceName));
                Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(inputStream).build();
                evaluator.verify();
        }

        @SneakyThrows
        public void verify(InputStream inputStream) {
                Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(inputStream).build();
                evaluator.verify();
        }


}
