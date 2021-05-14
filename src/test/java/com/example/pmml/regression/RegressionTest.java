package com.example.pmml.regression;

import com.example.pmml.VerificationHelper;
import com.example.pmml.VerificationHelperJpmml;
import org.jpmml.evaluator.EvaluationException;
import org.jpmml.evaluator.InvalidAttributeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RegressionTest {

        VerificationHelper verificationHelper;

        @BeforeEach
        void setUp() {
                verificationHelper = new VerificationHelperJpmml();
        }

        @Test
        void testPmml_SimpleLinearRegression() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/linear_regression/simple_linear_regression.xml");
        }

        @Test
        void testPmml_InvalidLinearRegression1_ShouldThrowAnError() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/regression/linear_regression/simple_linear_regression_invalidcase1.xml"));
        }

        @Test
        void testPmml_validLinearRegression2() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/linear_regression/simple_linear_regression_valid2.xml");
        }

        @Test
        void testPmml_InvalidLinearRegression2_ShouldThrowAnError() {
                Assertions.assertThrows(EvaluationException.class,
                        () -> verificationHelper.verify("com/example/pmml/regression_model/regression/linear_regression/simple_linear_regression_invalid2.xml"));
        }

        @Test
        void testPmml_TargetCategory() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/linear_regression/simple_linear_regression_valid2.xml");
        }


        @Test
        void pmmlWithTargetCategory_SoftMax() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/softmax.xml");
        }

        @Test
        void pmmlWithTargetCategory_None() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/none.xml");
        }

        @Test
        void pmmlWithTargetCategory_Logit() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/logit.xml");
        }

        @Test
        void pmmlWithTargetCategory_simpleMax() {
                Assertions.assertThrows(InvalidAttributeException.class, () -> verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/simplemax.xml"), "Attribute with value RegressionModel@normalizationMethod=simplemax is not valid");
        }

        @Test
        void pmmlWithTargetCategory_probit() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/probit.xml");
        }

        @Test
        void pmmlWithTargetCategory_cloglog() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/cloglog.xml");
        }

        @Test
        void pmmlWithTargetCategory_exp() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/exp.xml");
        }


        @Test
        void pmmlWithTargetCategory_loglog() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/loglog.xml");
        }

        @Test
        void pmmlWithTargetCategory_cauchit() {
                verificationHelper.verify("com/example/pmml/regression_model/regression/normalize_methods/cauchit.xml");
        }


}
