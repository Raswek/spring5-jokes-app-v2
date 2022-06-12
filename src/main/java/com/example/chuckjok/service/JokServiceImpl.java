package com.example.chuckjok.service;

import guru.springframework.norris.chuck.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Service
public class JokServiceImpl implements JokService
{
    private final ChuckNorrisInfoContributor chuckNorrisInfoContributor;
    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokServiceImpl()
    {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
        this.chuckNorrisInfoContributor = new ChuckNorrisInfoContributor();
    }

    @Override
    public String getJoke()
    {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
