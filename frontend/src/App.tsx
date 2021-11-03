import DataTabe from 'components/DataTable';
import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import React from 'react';

function App() {
  return (
    <>
    <NavBar />
    <div className="container">
      <h1 className="text-primary">Olá Mundo Walter Lindão</h1>

      <DataTabe />
    </div>
    <Footer />
    </>
  );
}

export default App;
