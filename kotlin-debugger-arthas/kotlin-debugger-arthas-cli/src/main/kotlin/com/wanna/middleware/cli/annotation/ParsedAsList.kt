package com.wanna.middleware.cli.annotation

@Target(AnnotationTarget.FUNCTION)
annotation class ParsedAsList(val separator: String = ",")
