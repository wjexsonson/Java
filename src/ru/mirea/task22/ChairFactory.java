package ru.mirea.task22;

public class ChairFactory {
    public Chair createChair(Chairs type){
        Chair chair=null;
        switch (type){
            case VICTORIAN_CHAIR:{
                chair = new Victorian_chair();
                break;
            }
            case MULTIFUINCTIONAL_CHAIR:{
                chair = new Multifunctional_chair();
                break;
            }
            case MAGIC_CHAIR:{
                chair = new Magic_chair();
                break;
            }
        }
        return chair;
    }
}