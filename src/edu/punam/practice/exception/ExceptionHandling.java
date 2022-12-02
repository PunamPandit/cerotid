package edu.punam.practice.exception;

public class ExceptionHandling {

    public void getCheckedException() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver"); //checked exception
    }

    public void getUnCheckedException() {
        int[] a = new int[2];
        a[3] = 1; //unchecked exception
    }

    public static void main(String[] args) {
        ExceptionHandling exceptionHandling = new ExceptionHandling();
        try {
            exceptionHandling.getCheckedException();
        } catch (ClassNotFoundException classNotFoundException) {
            System.out.println(classNotFoundException.getMessage());
        }

        try {
            exceptionHandling.getUnCheckedException();
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("arrayIndexOutOfBoundsException caught, please check code: " + arrayIndexOutOfBoundsException.getMessage());
        } catch (Exception exception) {
            System.out.println("Exception caught, please check code: " + exception.getMessage());
        } finally {
            System.out.println("I'm from finally block");
        }

        throw new RuntimeException("I'm Exception");
    }
}
