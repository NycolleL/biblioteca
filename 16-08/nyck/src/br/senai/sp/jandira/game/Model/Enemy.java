package br.senai.sp.jandira.game.Model;

public class Enemy {
    public String nome;
    public String skin;
    public int life;
    public Enemy(){
        life = 100;
    }
    public int getLife() {
        return life;
    }
}
