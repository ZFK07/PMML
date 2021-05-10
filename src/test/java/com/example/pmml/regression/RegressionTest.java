package com.example.pmml.regression;

import com.example.pmml.VerificationHelper;
import org.jpmml.evaluator.EvaluationException;
import org.jpmml.evaluator.InvalidAttributeException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RegressionTest {

        @Test
        void testPmml_SimpleLinearRegression() {
                VerificationHelper.verify("com/example/pmml/regression/linearregression/simple_linear_regression.xml");
        }

        @Test
        void testPmml_InvalidLinearRegression1_ShouldThrowAnError() {
                Assertions.assertThrows(EvaluationException.class, () -> VerificationHelper.verify("com/example/pmml/regression/linearregression/simple_linear_regression_invalidcase1.xml"));
        }

        @Test
        void testPmml_validLinearRegression2() {
                VerificationHelper.verify("com/example/pmml/regression/linearregression/simple_linear_regression_valid2.xml");
        }

        @Test
        void testPmml_InvalidLinearRegression2_ShouldThrowAnError() {
                Assertions.assertThrows(EvaluationException.class,
                        () -> VerificationHelper.verify("com/example/pmml/regression/linearregression/simple_linear_regression_invalid2.xml"));
        }

        @Test
        void testPmml_TargetCategory() {
                VerificationHelper.verify("com/example/pmml/regression/linearregression/simple_linear_regression_valid2.xml");
        }


        @Test
        void pmmlWithTargetCategory_SoftMax() {
                VerificationHelper.verify("com/example/pmml/regression/normalizemethods/softmax.xml");
        }

        @Test
        void pmmlWithTargetCategory_None() {
                VerificationHelper.verify("com/example/pmml/regression/normalizemethods/none.xml");
        }

        @Test
        void pmmlWithTargetCategory_Logit() {
                VerificationHelper.verify("com/example/pmml/regression/normalizemethods/logit.xml");
        }

        @Test
        void pmmlWithTargetCategory_simpleMax() {
                Assertions.assertThrows(InvalidAttributeException.class, () -> VerificationHelper.verify("com/example/pmml/regression/normalizemethods/simplemax.xml"), "Attribute with value RegressionModel@normalizationMethod=simplemax is not valid");
        }

        @Test
        void pmmlWithTargetCategory_probit() {
                VerificationHelper.verify("com/example/pmml/regression/normalizemethods/probit.xml");
        }

        @Test
        void pmmlWithTargetCategory_cloglog() {
                VerificationHelper.verify("com/example/pmml/regression/normalizemethods/cloglog.xml");
        }

        @Test
        void pmmlWithTargetCategory_exp() {
                VerificationHelper.verify("com/example/pmml/regression/normalizemethods/exp.xml");
        }


        @Test
        void pmmlWithTargetCategory_loglog() {
                VerificationHelper.verify("com/example/pmml/regression/normalizemethods/loglog.xml");
        }

        @Test
        void pmmlWithTargetCategory_cauchit() {
                VerificationHelper.verify("com/example/pmml/regression/normalizemethods/cauchit.xml");
        }


}
