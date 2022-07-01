package com.example.telacompras;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.telacompras.databinding.RowProdutoBinding;

import java.util.List;

public class ProdutosAdapter extends RecyclerView.Adapter<ProdutosAdapter.ProdutosViewHolder>
{
    private List<Produto> produtos;
    public  ProdutosAdapter(List<Produto> produtos){
        this.produtos = produtos;

    }
    @NonNull
    @Override
    public ProdutosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RowProdutoBinding binding = RowProdutoBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new  ProdutosViewHolder(binding);
    }

    @Override
    public int getItemCount() {
        return produtos.size();
    }

    @Override
    public void onBindViewHolder(@NonNull ProdutosViewHolder holder, int position) {
        holder.setComponents(produtos.get(position));

    }

    class ProdutosViewHolder extends RecyclerView.ViewHolder {
        private RowProdutoBinding binding;

        public ProdutosViewHolder (RowProdutoBinding binding){
            super(binding.getRoot());
            this.binding = binding;

        }

        public void setComponents(Produto produto){
            binding.produto.setText(produto.getNomeProduto());
            binding.valorInt.setText("R$ " + produto.getValor().toString());
            binding.quantidadeInt.setText(produto.getQuantidade().toString());
            binding.marcaReal.setText(produto.getMarca());
            binding.refInt.setText(produto.getReferencia());
            binding.desconto.setText(produto.getDesconto().toString()+"% de desconto");
            binding.leveQuant.setText("Leve " + produto.getPromocao().first.toString() + " pague " + produto.getPromocao().second.toString());


        }

    }




}
