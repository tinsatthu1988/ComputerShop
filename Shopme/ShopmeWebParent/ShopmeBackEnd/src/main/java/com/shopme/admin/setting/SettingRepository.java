package com.shopme.admin.setting;

import com.shopme.common.entity.setting.SettingCategory;
import org.springframework.data.repository.CrudRepository;

import com.shopme.common.entity.setting.Setting;

import java.util.List;

public interface SettingRepository extends CrudRepository<Setting, String> {
    public List<Setting> findByCategory(SettingCategory category);
}