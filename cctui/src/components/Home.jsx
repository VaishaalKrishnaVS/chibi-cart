import products from "../data/products";
import PageHeading from "./PageHeading";
import ProductListings from "./ProductListings";

export default function Home() {
  return (
    <div className="home-container">
      <PageHeading title="Explore Anime Stickers!">
        Discover unique, high-quality anime stickers for every fan. Express
        yourself with our exclusive sticker collection!
      </PageHeading>
      <ProductListings products={products} />
    </div>
  );
}
