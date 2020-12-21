package com.test;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

/**
 * @author 李国栋
 * @create 2020-12-01 9:55 上午
 */
public class SelectionSort_1 {

    private SelectionSort_1(){

    }

    private static <E extends Comparable<E>> void sort (E [] arr) {

        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex].compareTo(arr[j]) > 0) {
                   minIndex = j;
                }
            }
            swap(arr,minIndex,i);
        }

    }

    private static <E> void swap(E[] arr, int i, int j) {
        E tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Integer [] arr = {1,4,2,3,6,5};

        SelectionSort_1.sort(arr);
        for (int i : arr) {
            System.out.print(i+"  ");
        }
//
        Student[] stu = {
                new Student("jack",76),
                new Student("jerry",4),
                new Student("moniya",18),
                new Student("coff",16),

        };

        SelectionSort_1.sort(stu);
        for (Student student : stu) {
            System.out.println(student);
        }

    }











}
