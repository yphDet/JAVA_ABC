package com.CustomInterfaceGeneric;

public class CustominterfaceGeneric02 {
}
//实现泛型接口的另一种形式；

interface M<T>{}

class m<E> implements M<E>{}

interface N<t> extends M<t>{ }

