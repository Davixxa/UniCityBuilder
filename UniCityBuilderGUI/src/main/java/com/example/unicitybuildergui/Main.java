package com.example.unicitybuildergui;

import java.security.cert.PolicyQualifierInfo;
import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static GameMangaer gm;
    public static void main(String[] args) {
        GameMangaer gameMangaer = new GameMangaer();
        gameMangaer.setupGame();
        gm = gameMangaer;
    }
}

