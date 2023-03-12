package com.company;

import java.util.Random;

public class MoveWords{

    public static final int EMPATE = 0;
    public static final int GANA = 1;
    public static final int PIERDE = 2;

    private static final String[] validMoves = {"TIJERAS", "PAPEL", "PIEDRA", "TORITO","SEPIA"};
    private static final String[] validCommands = {"SALIR", "HELP"};

    private Random rnd;

    public MoveWords(){
        rnd = new Random();
    }

    public boolean isValidMoveCommand(String value){

        for (int i =0; i< validMoves.length; i++){
            if(validMoves[i].equals(value))
                return true;
        }

        for (int i =0; i< validCommands.length; i++){
            if(validCommands[i].equals(value))
                return true;
        }

        return false;
    }

    public String randomMove(){
        float p = rnd.nextFloat();
        return validMoves[ (int) (p * validMoves.length)];
    }

    public void showMoves(){
        for (String move : validMoves)
            System.out.print(move+" ");
        System.out.println();
    }
    public void showCommands(){
        for (String cmd : validCommands)
            System.out.print(cmd+" ");
        System.out.println();
    }

    public void showWords(){
        showMoves();
        showCommands();
    }

    private static int getIndex(String value){
        for (int i =0; i< validMoves.length; i++){
            if(validMoves[i].equals(value))
                return i;
        }
        return -1;
    }

    public static int checkWinner(String first, String second){

        String tijeras = "TIJERAS";
        String papel = "PAPEL";
        String piedra = "PIEDRA";
        String torito = "TORITO";
        String sepia = "SEPIA";
        switch (first){
            case "TIJERAS":
                if (second.equals(papel)){
                    return GANA;
                }else if (second.equals(torito)){
                    return GANA;
                }else if (second.equals(piedra)){
                    return PIERDE;
                }else if (second.equals(sepia)){
                    return PIERDE;
                }else{
                    return EMPATE;
                }

            case "PAPEL":
                if (second.equals(sepia)){
                    return GANA;
                }else if (second.equals(piedra)){
                    return GANA;
                }else if (second.equals(torito)){
                    return PIERDE;
                }else if (second.equals(tijeras)){
                    return PIERDE;
                }else{
                    return EMPATE;
                }


            case "PIEDRA":
                if (second.equals(torito)){
                    return GANA;
                }else  if (second.equals(tijeras)){
                    return GANA;
                }else if (second.equals(papel)){
                    return PIERDE;
                }else if (second.equals(sepia)){
                    return PIERDE;
                }else {
                    return EMPATE;
                }

            case "TORITO":
                if (second.equals(papel)){
                    return GANA;
                }else if (second.equals(sepia)){
                    return GANA;
                }else if (second.equals(piedra)){
                    return PIERDE;
                }else if (second.equals(tijeras)){
                    return PIERDE;
                }else {
                    return EMPATE;
                }

            case "SEPIA":
                if (second.equals(tijeras)){
                    return GANA;
                }else if (second.equals(piedra)){
                    return GANA;
                }else if (second.equals(papel)){
                    return PIERDE;
                }else if (second.equals(torito)){
                    return PIERDE;
                }else {
                    return EMPATE;
                }
        }
        return -1;
    }

}
