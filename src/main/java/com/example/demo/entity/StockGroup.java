package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;



@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StockGroup {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    public List<StockInfo> openStockInfos;

    @ManyToMany
    public List<Article> openArticles;

    @OneToOne(mappedBy = "stockGroup")
    @JoinColumn(name="account_id", referencedColumnName = "id")
    public Account account;
}
