import BarChart from 'components/BarChart';
import DataTabe from 'components/DataTable';
import DonutChart from 'components/DonutChart';
import Footer from 'components/Footer';
import NavBar from 'components/NavBar';
import React from 'react';

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Olá Seu Sistema de Vendas SoftWalter</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary"> Taxa de Sucesso</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary"> Taxa de Sucesso</h5>
            <DonutChart />
          </div>
        </div>

        <div>
          <h5 className="text-primary">Todas as vendas</h5>
        </div>
        <DataTabe />
      </div>
      <Footer />
    </>
  );
}

export default App;
