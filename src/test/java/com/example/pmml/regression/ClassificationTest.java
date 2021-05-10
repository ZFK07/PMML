package com.example.pmml.regression;

import com.example.pmml.VerificationHelper;
import org.jpmml.evaluator.EvaluationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClassificationTest {

        @Test
        void testPmml_classificationOfSpeed() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfSpeed.xml");
        }

        @Test
        void testPmml_classificationOfJobCategory() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfJobCategory.xml");
        }

        @Test
        void testPmml_classificationOfSpeed_InvalidCases_ShouldThrowAnException() {
                Assertions.assertThrows(EvaluationException.class, ()-> VerificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfSpeed_invalidCase.xml"));
        }

        @Test
        void testPmml_classificationOfJobCategory_InvalidCases_ShouldThrowAnException() {
                Assertions.assertThrows(EvaluationException.class, ()->VerificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfJobCategory_invalidCase.xml"),"Values skilled and professional do not match");
        }
}
