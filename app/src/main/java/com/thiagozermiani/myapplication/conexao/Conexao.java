package com.thiagozermiani.myapplication.conexao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by thiago zermiani on 06/03/2017.
 */

public class Conexao extends SQLiteOpenHelper {

    private final static String BASE = "calculos";
    private final static int VERSAO = 1;


    public Conexao(Context context) {
        super(context, BASE , null ,VERSAO);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CRIA_TABELA_calculos = "CREATE TABLE calculos(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT ," +
                "valorum Real," +
                "valordois Real," +
                "operador text" +
                "resposta Real";
        db.execSQL(CRIA_TABELA_calculos);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
