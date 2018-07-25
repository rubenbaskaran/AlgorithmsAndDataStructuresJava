package com.rubenbaskaran;

class QueueOfStacks
{
    private Stack stackA;
    private Stack stackB;

    QueueOfStacks()
    {
        stackA = new Stack();
        stackB = new Stack();
    }

    void Add(int item)
    {
        stackA.Push(item);
    }

    int Remove()
    {
        while (stackA.Peek() != null)
        {
            stackB.Push(stackA.Pop());
        }

        int returnValue = stackB.Pop();

        while (stackB.Peek() != null)
        {
            stackA.Push(stackB.Pop());
        }

        return returnValue;
    }

    int Peek()
    {
        while (stackA.Peek() != null)
        {
            stackB.Push(stackA.Pop());
        }

        int returnValue = this.stackB.Peek();

        while (stackB.Peek() != null)
        {
            stackA.Push(stackB.Pop());
        }

        return returnValue;
    }

    void Print()
    {
        stackA.Print();
    }
}

