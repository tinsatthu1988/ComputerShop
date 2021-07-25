package com.shopme.admin.setting;

import org.springframework.data.repository.CrudRepository;

import com.shopme.common.entity.Currency;

import java.util.List;

public interface CurrencyRepository extends CrudRepository<Currency, Integer> {
    public List<Currency> findAllByOrderByNameAsc();
}