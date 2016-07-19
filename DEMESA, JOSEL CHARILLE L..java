 public class ArrayQueuee {
            private int QSIZE;
            private int[] queue;
            private int nItems;

            public ArrayQueuee(int size){
                QSIZE = size;
                queue = new int[QSIZE];
            }

            public void showQueue(){
                int i;
                for(i = 0; i < QSIZE; i++){
                    System.out.print("Queue[%d] = %d\n" +queue[i]);
                }   
            }

            private boolean isEmpty(){
                if(nItems == 0){
                System.out.print("QUEUE is EMPTY");

                return true;

                } else {

                return false;
                }
            }

            private boolean isFull(){
                if(nItems == QSIZE){
                    System.out.print("Queue is FULL");
                    return true;
                } else {

                return false;
                }
            }

            public boolean enqueue(int num){
                System.out.print("Trying to enqueue " + num + "... ");
                if(! isFull()){
                    queue[nItems] = num;
                    System.out.print("Added " + num);
                    nItems++;
                    return true;
                } else {
                    System.out.print("Failed to enqueue " + num);
                    return false;
                }
            }

            public void dequeue(){
                System.out.print("Dequeuing... ");
                if(! isEmpty()){
                    int num = queue[0];
                    System.out.print("Removed " + num);
                    rearrangeQueue();
                } else {
                    System.out.print("Failed to dequeue");
                }
            }

            private void rearrangeQueue(){
                System.out.println("Rearranging Queue");
                int[] temp = new int[nItems];
                int i;
                for(i = 0; i < (nItems - 1); i++){
                    temp[i] = queue[i + 1];
                }
                nItems--;
                for(i = 0; i < QSIZE; i++){
                    if(i <= nItems){
                    queue[i] = temp[i];
                } else {
                    queue[i] = 0;
                    }
                }
            }

            public int peekFront(){
                return queue[0];
            } 

            public int peekRear(){
                return queue[nItems];
            }
        }



