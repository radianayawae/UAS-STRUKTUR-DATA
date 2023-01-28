package com.mycompany.stack.queue;

/**
 *
 * @author ASUS
 */
public class StackQueue {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(5);

        System.out.println(stack.isEmpty());

        stack.push(new Employee("Kuro","KuroKy", 1));
        stack.push(new Employee("Iki","Jablay",2));
        stack.push(new Employee("Opik","Bahdim",3));
        stack.push(new Employee("Toni","Ganjar",4));
        stack.push(new Employee("Mu'min","Muslimat",3));
        stack.push(new Employee("Bono","Galagher",4));
        stack.push(new Employee("Burok","Gojek", 1));
        stack.push(new Employee("Rizaldi","Taher",2));


        //System.out.println(stack.peek());

        System.out.println(stack.isEmpty());
        //stack.printStack();
    }
}
