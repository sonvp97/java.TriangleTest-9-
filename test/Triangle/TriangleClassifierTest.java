package Triangle;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @org.junit.jupiter.api.Test
    void testTriangle() {
        int a = 2;
        int b = 2;
        int c = 2;

        String excuted = "Equilateral triangle";
        String resuilt = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(excuted,resuilt);
    }
    @org.junit.jupiter.api.Test
    void testTriangle2() {
        int a = 2;
        int b = 2;
        int c = 3;

        String excuted = "Isosceles triangle";
        String resuilt = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(excuted,resuilt);
    }
    @org.junit.jupiter.api.Test
    void testTriangle3() {
        int a = 3;
        int b = 4;
        int c = 5;

        String excuted = "Regular triangle";
        String resuilt = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(excuted,resuilt);
    }
    @org.junit.jupiter.api.Test
    void testTriangle4() {
        int a = 8;
        int b = 2;
        int c = 3;

        String excuted = "Not a triangle";
        String resuilt = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(excuted,resuilt);
    }
    @org.junit.jupiter.api.Test
    void testTriangle5() {
        int a = -1;
        int b = 2;
        int c = 1;

        String excuted = "Not a triangle";
        String resuilt = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(excuted,resuilt);
    }
    @org.junit.jupiter.api.Test
    void testTriangle6() {
        int a = 0;
        int b = 1;
        int c = 1;

        String excuted = "Not a triangle";
        String resuilt = TriangleClassifier.getTriangle(a,b,c);
        assertEquals(excuted,resuilt);
    }
}