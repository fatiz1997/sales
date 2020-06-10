package com.check.sales.view;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Deprecated
public class StringSearchable implements Searchable<String, String> {

    private List<String> terms = new ArrayList<>();

    public StringSearchable(List<String> terms) {
        this.terms.addAll(terms);
    }

    @Override
    public Collection<String> search(String value) {
        List<String> founds = new ArrayList<>();

        for (String s : terms) {
            if (s.indexOf(value) == 0) {
                founds.add(s);
            }
        }
        return founds;
    }
}