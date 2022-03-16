import { render } from '@testing-library/react';
import React from 'react';
import Header from './components/Header';

describe("<PostsList />", () => {
  it("Renders <Header /> component correctly", () => {
    const { getByText } = render(<Header />);
    expect(getByText(/Posts App/i)).toBeInTheDocument();
  });
});
