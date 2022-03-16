import React from 'react';
import { BrowserRouter, Switch, Route } from 'react-router-dom';
import Header from '../components/Header';
import PostsList from '../pages/posts/PostsList';
import { NotFound } from '../pages/error';
import './AppRouter.scss'

const AppRouter = () => {
  return (
    <BrowserRouter>
        <Header />
        <section className="main-content">
          <Switch>
            <Route component={PostsList} path="/" exact={true} />
            <Route component={PostsList} path="/posts" />
            <Route component={NotFound} path="*" />
          </Switch>
        </section>
    </BrowserRouter>
  );
};

export default AppRouter;
