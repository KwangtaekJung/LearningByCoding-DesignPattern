package com.example.inflearndesignpattern._01_creational_patterns._02_factorymethod._02_after.using_abstract_class;

import com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._02_after.Anchor;
import com.example.inflearndesignpattern._01_creational_patterns._03_abstract_factory._02_after.Wheal;
import lombok.Data;

@Data
public class Ship {

    private String name;

    private String color;

    private String logo;

    private Anchor anchor;

    private Wheal wheal;
}
