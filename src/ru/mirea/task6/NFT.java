package ru.mirea.task6;

public class NFT implements Nameable, Priceable{

    @Override
    public String getName() {
        return "I am NFT new meta";
    }

    @Override
    public String getPrice() {
        return "My price starts from 10$ in SOL";
    }

    public static void main(String[] args) {
        NFT nft=new NFT();
        System.out.print(nft.getName()+"\n"+nft.getPrice());
    }

}