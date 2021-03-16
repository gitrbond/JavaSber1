package ru.sber.reportGenerator;

import java.util.List;

interface ReportGenerator<T> {
    Report generate(List<T> entities) throws IllegalAccessException;
}