package com.thiagozermiani.myapplication.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.thiagozermiani.myapplication.entidade.Calculo;
import com.thiagozermiani.myapplication.conexao.Conexao;

/**
 * Created by thiago zermiani on 08/03/2017.
 */

public class CalculosDAO {
    private Context context ;

    public CalculosDAO(Context context){
        this.context =context;
    }

    public void inserir(Calculo calculo){
        ContentValues values = new ContentValues();
        values.put("valorUm", calculo.getValorUm());
        values.put("valorDois", calculo.getValorDois());
        values.put("operador", calculo.getOperador());
        values.put("resposta", calculo.getResultado());



        Conexao conexao = new Conexao(context);

        SQLiteDatabase db = conexao.getWritableDatabase();
        db.insert("calculo" ,null, values);
        db.close();
        conexao.close();
    }

}
