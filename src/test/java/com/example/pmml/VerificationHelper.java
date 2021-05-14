package com.example.pmml;

import java.io.InputStream;

public interface VerificationHelper {
        public void verify(String resourceName);

        public void verify(InputStream inputStream);

}
