package com.example.allyson.roteiro;

/**
 * Created by allyson on 20/11/16.
 */

import java.util.ArrayList;
import java.util.List;

public class Decision {
    private List<String> teste;
    private Locals[] array;
    private List<Locals> arrayLocais;

    public Decision() {
        teste = new ArrayList<String>();
        teste.add("Bar");
        teste.add("Museu");

        arrayLocais = new ArrayList<Locals>();
        arrayLocais.add(new Locals("Rock in Reabs", "Bar", 0, "08:00", "3", -8.06405238, -34.87158716));
        arrayLocais.add(new Locals("Bistro Buteco", "Bar", 0, "08:00", "3", -8.06259175, -34.87066984));
        arrayLocais.add(new Locals("Caixa Cultura Recife", "Museu", 15, "09:00", "4", -8.062577639207683, -34.87145226901435));
        arrayLocais.add(new Locals("Sinagoga", "Museu", 0, "08:00", "3", -8.06189065, -34.87138867));
        arrayLocais.add(new Locals("Torre Malakoff", "Diversao", 150, "10:00", "7", -8.060745474745637, -34.87037133878135));
        arrayLocais.add(new Locals("Centro Artesanato de Pernambuco", "Museu", 5, "07:00", "1", -8.062282856771736, -34.871192094739904));
        arrayLocais.add(new Locals("Downtown Pier", "Bar", 0, "21:00", "1", -8.06473755, -34.87182319));
    }

    public ArrayList packing(List<Locals> listaUsuario, int dias, int tempoPorDia, double budget){
        Locals[] arrayLocais = new Locals[listaUsuario.size()];
        listaUsuario.toArray(arrayLocais);

        ArrayList<Locals> packed = new ArrayList();
        int aux = 0;
        double auxMoney = 0;
        for(int i=0; i<arrayLocais.length;i++){
            if(((Integer.parseInt(arrayLocais[i].timeSpend)) + aux <= tempoPorDia) && (arrayLocais[i].price + auxMoney) <= budget ){
                packed.add(arrayLocais[i]);
                aux += Integer.parseInt(arrayLocais[i].timeSpend);
                auxMoney += arrayLocais[i].price;
            }
        }


        return packed;
    }

    public ArrayList choice(){
        return packing(escolha(teste, arrayLocais), 1, 2, 10);
    }

    private ArrayList escolha(List<String> preferencias, List<Locals> locals){
        ArrayList escolhidos = new ArrayList();

        Locals[] locais = new Locals[locals.size()];
        locals.toArray(locais);

        String[] auxiliar = new String[preferencias.size()];
        preferencias.toArray(auxiliar);

        for(int i=0; i<locais.length;i++){
            for(int j=0; j<auxiliar.length;j++){
                if(locais[i].getDescription().contains(auxiliar[j])){
                    escolhidos.add(locais[i]);
                }

            }
        }

        return escolhidos;
    }


}