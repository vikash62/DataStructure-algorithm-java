package com.bridgelabz.ds.cashcounter;

public class CashCounter {
    Person head;
    static int noOfCustomers;

    public boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }

    private void addLast(int money) {
        Person person = new Person(money);
        noOfCustomers--;
        if (isEmpty()) {
            head = person;
            head.bankBalance += head.money;
            noOfCustomers++;
            return;
        }

        Person currPerson = head;
        while (currPerson.nextPerson != null) {
            currPerson = currPerson.nextPerson;
        }
        currPerson.nextPerson = new Person(money);
        currPerson.nextPerson.bankBalance += currPerson.nextPerson.money;
    }

    public void enqueue(int money) {
        addLast(money);
    }

    private void deleteFirst() {
        if (isEmpty()) {
            return;
        }
        head = head.nextPerson;
        noOfCustomers--;
    }

    public void dequeue() {
        deleteFirst();
    }

    public int noOfPersonInQueue() {
        System.out.println();
        return noOfCustomers;
    }
}