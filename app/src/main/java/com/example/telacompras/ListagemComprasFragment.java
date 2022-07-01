package com.example.telacompras;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.telacompras.databinding.FragmentListagemComprasBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListagemComprasFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListagemComprasFragment extends Fragment {

    private FragmentListagemComprasBinding binding;
    private List<Produto> produtos = new ArrayList<>();



    public ListagemComprasFragment() {
        // Required empty public constructor
        Produto produtoArroz = new Produto("Arroz",20.0,12,"Vasconcelos","001",10,new Pair<>(5,4));
        Produto produtoFeijao = new Produto("Feijão",10.0,15,"Vasconcelos","002",5,new Pair<>(6,5));
        Produto produtoDetergente = new Produto("Detergente",1.99,100,"Ype","405",20,new Pair<>(10,9));
        produtos.add(produtoArroz);
        produtos.add(produtoFeijao);
        produtos.add(produtoDetergente);
    }



    public static ListagemComprasFragment newInstance(String param1, String param2) {
        ListagemComprasFragment fragment = new ListagemComprasFragment();
        Bundle args = new Bundle();

        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentListagemComprasBinding.inflate(inflater, container, false);
        setCompoments();
        return binding.getRoot();
    }

    private void setCompoments(){
        binding.ListaDeProdutos.setAdapter(new ProdutosAdapter(produtos));
        binding.ListaDeProdutos.setLayoutManager(new LinearLayoutManager(requireContext()));
    }
}