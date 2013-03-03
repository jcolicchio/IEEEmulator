/**
 * Created with IntelliJ IDEA.
 * User: zhansaya
 * Date: 2/28/13
 * Time: 7:53 PM
 * To change this template use File | Settings | File Templates.
 */


public class GameLogic implements Runnable {
    public int A;
    public int X;
    public int Y;
    public int PC;

    public Boolean C;
    public Boolean Z;

    public int[] memory;


    int loc;



    public GameLogic() {
        System.out.println("a new game logic instance was created");
        memory = new int[5];
        memory[0]=0xa9;
        memory[1]=0x05;




    }

    //let's use a thread for the update cycle
    //when you call gameLogic.start(); it should make the thread and start it running
    public void start(){
        (new Thread(new GameLogic())).start();
    }

    public void run() {

        loc = 0;

        while(memory[loc] != 0x00 && loc < memory.length){
            switch (memory[loc]){
                case 0xa9:{
	                LDA();



                }
                loc++;
            }

        }
        System.out.println(A);

    }

	public void LDA(){
		A = memory[++loc];
		//System.out.print(A);


	}

	public void LDX(){
		X = memory[++loc];

	}
	public void LDY(){
		Y = memory[++loc];
	}


}
