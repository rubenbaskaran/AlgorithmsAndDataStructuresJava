package com.rubenbaskaran;

import java.util.ArrayList;
import java.util.List;

class Stack
{
    private List<Integer> stack;

    Stack()
    {
        stack = new ArrayList<>();
    }

    void Push(int item)
    {
        stack.add(item);
    }

    Integer Pop()
    {

        return stack.isEmpty() ? null : stack.remove(stack.size() - 1);
    }

    Integer Peek()
    {

        return stack.isEmpty() ? null : stack.get(stack.size() - 1);
    }

    void Print()
    {
        for (int item : stack)
        {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}