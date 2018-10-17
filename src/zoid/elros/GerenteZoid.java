/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoid.elros;

import java.util.HashMap;
import zoid.avatar.aragorn.FabricaAvatar;
import zoid.bilbo.LivroEstorias;
import zoid.itens.gandwise.FabricaItens;
import zoid.sauron.Jogo;
import zoid.localizacao.celeborn.LivroMapas;
import zoid.eomer.LivroMissoes;

/**
 *
 * @author andre
 */
public abstract class GerenteZoid {
    protected HashMap<String,Jogo> listaJogos;
    protected FabricaAvatar avataresJogadores;
    protected FabricaAvatar avataresNaoJogadores;
    protected FabricaItens  itensDisponiveis;
    protected LivroEstorias estoriasDisponivel;
    protected LivroMissoes missoesDisponivel;
    protected LivroMapas   mapasDisponiveis;
    public abstract void iniciarZoid();
    
}
