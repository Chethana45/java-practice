


class Q{

int n;

boolean valueset = false;

synchronized int get(){

while(!valueset){

try{

wait();

}catch(InterruptedException e){

System.out.println(e);

}

}

System.out.println("Got: "+n);

valueset = false;

notify();

return n;

}

synchronized void put(int n){

while(valueset){

try{

wait();

}catch(InterruptedException e){

System.out.println(e);

}

}

this.n = n;

System.out.println("Put "+n);

valueset = true;

notify();

}

}


class Producer implements Runnable{

Q q;

Producer(Q q){

this.q = q;

new Thread(this, "Producer").start();

}

public void run(){

int i=0;

for(i=1; i<=5;i++){

q.put(i);

}

}

}


class Consumer implements Runnable{

Q q;

Consumer(Q q){

this.q = q;

new Thread(this, "Consumer").start();

}

public void run(){

for(int j=1; j<=5;j++){

q.get();

}

}

}
public class Demo{

public static void main(String[] args){

Q q = new Q();

new Producer(q);

new Consumer(q);

System.out.println("Press ctrl+c to stop");

}

}