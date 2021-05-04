package com.example.pmml.regression;

import org.jpmml.evaluator.Evaluator;
import org.jpmml.evaluator.LoadingModelEvaluatorBuilder;
import org.junit.jupiter.api.Test;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.io.IOException;

class RegressionTest {

        @Test
        void testPmml_INVALIDVALUETREATMENTMETHODisAsIs() throws JAXBException, SAXException, IOException {
                Evaluator evaluator = new LoadingModelEvaluatorBuilder().load(new File("src/test/java/com/example/pmml/regression/linearregression.xml")).build();
                evaluator.verify();
        }
}
