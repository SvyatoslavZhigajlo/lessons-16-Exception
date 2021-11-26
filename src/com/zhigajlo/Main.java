package com.zhigajlo;

public class Main {

    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        String name = null;
        try {
            Student student = deserialize(name);
            System.out.println(deserialize(name));
        } catch (MyDomainException e) {
            e.printStackTrace("Не верное имя студента");
        } catch (IllegalArgumentException ex){
            try {
                throw new RuntimeException();
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        }
    }

    private Student deserialize(String name) throws MyDomainException {
        Student student = new Student();
        student.setName(name);
        student.setAge(56);
        return student;
    }
}
