package com.example.pmml;

import lombok.SneakyThrows;
import org.jpmml.evaluator.EvaluationException;
import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
import org.junit.jupiter.api.function.Executable;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.InputStream;
import java.util.Objects;

public class VerificationHelper {
        @SneakyThrows
        public static void verify(String resourceName) {
                InputStream inputStream = Objects.requireNonNull(VerificationHelper.class.getClassLoader().getResourceAsStream(resourceName));
                Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(inputStream).build();
                evaluator.verify();
        }
        @SneakyThrows
        public static void verify(InputStream inputStream) {
                Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(inputStream).build();
                evaluator.verify();
        }


}
