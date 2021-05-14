package com.example.pmml.regression;

import com.example.pmml.VerificationHelper;
import com.example.pmml.VerificationHelperJpmml;
import org.jpmml.evaluator.EvaluationException;
import org.jpmml.evaluator.InvalidElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ClassificationTest {
        VerificationHelper verificationHelper;

        @BeforeEach
        void setUp() {
                verificationHelper = new VerificationHelperJpmml();
        }

        @Test
        void testPmml_classificationOfSpeed() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfSpeed.xml");
        }

        @Test
        void testPmml_classificationOfJobCategory() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfJobCategory.xml");
        }

        @Test
        void testPmml_classificationOfSpeed_InvalidCases_ShouldThrowAnException() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfSpeed_invalidCase.xml"));
        }

        @Test
        void testPmml_classificationOfJobCategory_InvalidCases_ShouldThrowAnException() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/classification/classificationOfJobCategory_invalidCase.xml"), "Values skilled and professional do not match");
        }


        @Test
        void testPmml_normalizeMethod_softmax() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/softmax.xml");
        }

        @Test
        void testPmml_normalizeMethod_simpleMax() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/simplemax.xml");
        }

        @Test
        void testPmml_normalizeMethod_none() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/none.xml");
        }

        @Test
        void testPmml_normalizeMethod_logit() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/logit.xml");
        }

        @Test
        void testPmml_normalizeMethod_cloglog_invalid() {
                Assertions.assertThrows(InvalidElementException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/cloglog_invalid.xml"), "Element RegressionModel is not valid");
        }

        @Test
        void testPmml_normalizeMethod_cloglog() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/cloglog.xml");
        }

        @Test
        void testPmml_normalizeMethod_loglog() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/loglog.xml");
        }

        @Test
        void testPmml_normalizeMethod_loglog_invalid() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/loglog_invalid.xml"));
        }

        @Test
        void testPmml_normalizeMethod_cauchit() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/cauchit.xml");
        }

        @Test
        void testPmml_normalizeMethod_cauchitInvalid() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/cauchit_invalid.xml"), "Values fast and slow do not match");
        }

        @Test
        void testPmml_normalizeMethod_probit() {
                verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/probit.xml");
        }

        @Test
        void testPmml_normalizeMethod_probitInvalid() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/probit_invalid.xml"), "Values fast and slow do not match");
        }

        @Test
        void testPmml_normalizeMethod_probitInvalidSyntax() {
                Assertions.assertThrows(InvalidElementException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/probit_invalidSyntax.xml"), "Element RegressionModel is not valid");
        }

        @Test
        void testPmml_normalizeMethod_noneInvalid() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/classification/normalize_methods/none_invalid.xml"), "Element RegressionModel is not valid");
        }

}
