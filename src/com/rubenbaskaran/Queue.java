package com.rubenbaskaran;

import java.util.ArrayList;
import java.util.List;

class Queue
{
    private List<Integer> queue;

    Queue()
    {
        queue = new ArrayList<>();
    }

    void Add(int item)
    {
        if (queue.isEmpty())
        {
            queue.add(item);
        }
        else
        {
            List<Integer> shiftedQueue = new ArrayList<>();
            shiftedQueue.add(item);
            shiftedQueue.addAll(queue.subList(0, queue.size()));
            queue = shiftedQueue;
        }
    }

    int Remove()
    {
        return queue.remove(queue.size() - 1);
    }

    Integer Peek()
    {
        return queue.isEmpty() ? null : queue.get(queue.size() - 1);
    }

    void Weave(Queue queueOne, Queue queueTwo)
    {
        while (queueOne.Peek() != null || queueTwo.Peek() != null)
        {
            if (queueOne.Peek() != null)
            {
                this.Add(queueOne.Remove());
            }

            if (queueTwo.Peek() != null)
            {
                this.Add(queueTwo.Remove());
            }
        }
    }

    void Print()
    {
        for (int item : queue)
        {
            System.out.print(item + " ");
        }

        System.out.println();
    }
}
