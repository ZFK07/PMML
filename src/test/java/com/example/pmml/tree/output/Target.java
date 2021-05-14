package com.example.pmml.tree.output;

import com.example.pmml.VerificationHelper;
import com.example.pmml.VerificationHelperJpmml;
import org.jpmml.evaluator.EvaluationException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Target {


        VerificationHelper verificationHelper;

        @BeforeEach
        void setUp() {
                verificationHelper = new VerificationHelperJpmml();
        }

        @Test
        void treeModelOutput_entityID() {
                verificationHelper.verify("com/example/pmml/tree/output/feature_entityid.xml");
        }

        @Test
        void treeModelOutput_entityID_invalidCases1ShouldThrowError() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_entityidinvalidcase1.xml"), "Values 2.0 and 1.0 do not match");
        }

        @Test
        void treeModelOutput_entityID_invalidCase2ShouldThrowError() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_entityidinvalidcase2.xml"), "Values 1.0 and 3.0 do not match");
        }

        @Test
        void treeModelOutput_entityID_invalidCase3ShouldThrowError() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_entityidinvalidcases3.xml"), "Values 1.0 and 3.0 do not match");
        }

        @Test
        void treeModelOutput_feature_predict() {
                verificationHelper.verify("com/example/pmml/tree/output/feature_predictedvalue.xml");
        }

        @Test
        void treeModelOutput_feature_predict_invalidCases() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_predictedvalue_invalidcase1.xml"), "Values 1001.0 and 1000.0 do not match");
        }

        @Test
        void treeModelOutput_feature_predict_invalidCases2() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_predictedvalue_invalidcase2.xml"));
        }

        @Test
        void treeModelOutput_feature_predict_displayValue() {
                verificationHelper.verify("com/example/pmml/tree/output/feature_predicteddisplayvalue.xml");
        }

        @Test
        void treeModelOutput_feature_predictdisplayValue_InvalidCases1() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_predicteddisplayvalue_invalidcase1.xml"));
        }

        @Test
        void treeModelOutput_feature_predictdisplayValue_InvalidCases2() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_predicteddisplayvalue_invalidcase2.xml"));
        }

        @Test
        void treeModelOutput_feature_predictdisplayValue_InvalidCases3() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_predicteddisplayvalue_invalidcase3.xml"));
        }

        @Test
        void treeModelOutput_feature_transformValue() {
                verificationHelper.verify("com/example/pmml/tree/output/feature_transformvalue.xml");
        }

        @Test
        void treeModelOutput_feature_transformValueWithRounding() {
                verificationHelper.verify("com/example/pmml/tree/output/feature_transformvalue_withrounding.xml");
        }

        @Test
        void treeModelOutput_feature_probability() {
                verificationHelper.verify("com/example/pmml/tree/output/feature_probability_complex.xml");
        }

        @Test
        void treeModelOutput_feature_probability2() {
                verificationHelper.verify("com/example/pmml/tree/output/feature_probability_simple.xml");
        }

        @Test
        void treeModelOutput_feature_invalidCase1() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_probability_invalidcase1.xml"));
        }

        @Test
        void treeModelOutput_feature_invalidCase2() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_probability_invalidcase2.xml"));
        }

        @Test
        void treeModelOutput_feature_invalidCase3() {
                Assertions.assertThrows(EvaluationException.class, () -> verificationHelper.verify("com/example/pmml/tree/output/feature_probability_invalidcase3.xml"));
        }
}
