package com.example.inflearndesignpattern._01_creational_patterns._01_singleton;

/**
 * 싱글통 패턴 4: 안전하고 단순하게 구현하는 방법
 * using Enum
 * 로딩되는 시점에 미리 만들어진다는 단점이 있음. 지연 로딩 안됨.
 * 상속을 쓰지 못하는 것도 단점임.
 */
public enum Settings4 {

    INSTANCE;

}
