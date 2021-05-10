package com.example.pmml.regression;

import com.example.pmml.VerificationHelper;
import org.jpmml.evaluator.EvaluationException;
import org.jpmml.evaluator.InvalidElementException;
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
                Assertions.assertThrows(EvaluationException.class, () -> VerificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfSpeed_invalidCase.xml"));
        }

        @Test
        void testPmml_classificationOfJobCategory_InvalidCases_ShouldThrowAnException() {
                Assertions.assertThrows(EvaluationException.class, () -> VerificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfJobCategory_invalidCase.xml"), "Values skilled and professional do not match");
        }


        @Test
        void testPmml_normalizeMethod_softmax() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/softmax.xml");
        }

        @Test
        void testPmml_normalizeMethod_simpleMax() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/simplemax.xml");
        }

        @Test
        void testPmml_normalizeMethod_none() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/none.xml");
        }

        @Test
        void testPmml_normalizeMethod_logit() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/logit.xml");
        }

        @Test
        void testPmml_normalizeMethod_cloglog_invalid() {
                Assertions.assertThrows(InvalidElementException.class, () -> VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/cloglog_invalid.xml"), "Element RegressionModel is not valid");
        }

        @Test
        void testPmml_normalizeMethod_cloglog() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/cloglog.xml");
        }
        @Test
        void testPmml_normalizeMethod_loglog() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/loglog.xml");
        }

        @Test
        void testPmml_normalizeMethod_loglog_invalid() {
                Assertions.assertThrows( EvaluationException.class, ()-> VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/loglog_invalid.xml"));
        }

        @Test
        void testPmml_normalizeMethod_cauchit() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/cauchit.xml");
        }
        @Test
        void testPmml_normalizeMethod_cauchitInvalid() {
                Assertions.assertThrows(EvaluationException.class, ()->VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/cauchit_invalid.xml"), "Values fast and slow do not match");
        }

        @Test
        void testPmml_normalizeMethod_probit() {
                VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/probit.xml");
        }
        @Test
        void testPmml_normalizeMethod_probitInvalid() {
                Assertions.assertThrows(EvaluationException.class, ()->VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/probit_invalid.xml"), "Values fast and slow do not match");
        }

        @Test
        void testPmml_normalizeMethod_probitInvalidSyntax() {
               Assertions.assertThrows(InvalidElementException.class, ()-> VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/probit_invalidSyntax.xml"),"Element RegressionModel is not valid");
        }

        @Test
        void testPmml_normalizeMethod_noneInvalid() {
               Assertions.assertThrows(EvaluationException.class, ()-> VerificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/none_invalid.xml"),"Element RegressionModel is not valid");
        }

}
