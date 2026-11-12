
package com.example.maven_prag;

public class EquilateralTriangle {

    public boolean isEquilateral(int a, int b, int c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }

        return (a == b && b == c);
    }
}
