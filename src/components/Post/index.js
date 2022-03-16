import React from "react";
import DatePlaceholder from "../Date";
import Image from "../Image";
import Tag from "../Tag";
import { PostTitle } from "../Title";
import './Post.scss'

const ImageWithLink = ({url, src, alt}) => (<a href={url}>{<Image src={src} alt={alt} />}</a>);
const PostTitleWithLink = ({url, children}) => {
  return <>
    <a style={{ color: "inherit", textDecoration: "inherit" }} href={url}>
      <PostTitle>{children}</PostTitle>
    </a>
  </>
};

const Post = ({ url, title, date, tag, image}) => {
  return <>
    <article className="post">
      <ImageWithLink
        url={url}
        src={image}
        alt={title}
      />
      <span className="row">
        <Tag>{tag}</Tag>
        <DatePlaceholder dateString={date} />
      </span>
      <PostTitleWithLink url={url}>{title}</PostTitleWithLink>
    </article>
  </>
}
export default Post